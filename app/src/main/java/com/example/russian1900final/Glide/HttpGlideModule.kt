/*
 * Copyright (c) 2020 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.example.liberatingdelta2020.glide

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.Registry
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.module.AppGlideModule
import okhttp3.*
import java.io.IOException
import java.io.InputStream

// Remember the dependency you added with kapt in the build.gradle file earlier? This is where you need it.
@GlideModule
class HttpGlideModule : AppGlideModule() {

  // The only thing you need to do here is to override the registerComponents(...)
  // and replace it with your own OkHttpClient.
  override fun registerComponents(context: Context, glide: Glide, registry: Registry) {
    super.registerComponents(context, glide, registry)
    val client = OkHttpClient.Builder()
        // Add an Interceptor to your own OkHttpClient.
        /*
        // we do not need to read the amount of bytes that have been downloaded,
        // so this is removed until further notice.
        .addNetworkInterceptor { chain ->
          val request = chain.request()
          val response = chain.proceed(request)
          // This is where you create your DispatchingProgressManager instance.
          val listener = DispatchingProgressManager()
          // This is where you provide your own OkHttpProgressResponseBody with the DispatchingProgressManager instance.
          response.newBuilder()
              .body(OkHttpProgressResponseBody(request.url(), response.body()!!, listener))
              .build()
        }
        */
        // authenticator
        .authenticator(object : Authenticator {
          @Throws(IOException::class)
          override fun authenticate(route: Route?, response: Response): Request? {
            if (responseCount(response) >= 3) {
              return null // If we've failed 3 times, give up. - in real life, never give up!!
            }
            val credential: String = Credentials.basic("family", "pheiffer")
            return response.request().newBuilder().header("Authorization", credential).build()
          }
        })
        .build()
    // Glide provides a OkHttpUrlLoader.Factory class for you to conveniently replace Glide's default networking library.
    glide.registry.replace(GlideUrl::class.java, InputStream::class.java, OkHttpUrlLoader.Factory(client))
  }

  private fun responseCount(response: Response): Int {
    var res: Response? = response
    var result = 1
    while (res?.priorResponse().also({ res = it }) != null) {
      result++
    }
    return result
  }
}
