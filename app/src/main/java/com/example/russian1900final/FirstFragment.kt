package com.example.russian1900final

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class   FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler = SceneRecycler.newInstance()
        val fm = childFragmentManager
        val ft = fm.beginTransaction()
        ft.add(R.id.main_recycler, recycler)
        ft.addToBackStack(null)
        ft.commit()

        view.findViewById<Button>(R.id.main_continueChrono).setOnClickListener {
            val action: NavDirections = FirstFragmentDirections.actionFirstFragmentToCharacterChoiceFragment(ContinueType.CHRONOLOGICAL.typeNum)
            this.findNavController().navigate(action)
        }
        view.findViewById<Button>(R.id.main_continueRand).setOnClickListener {
            val action: NavDirections = FirstFragmentDirections.actionFirstFragmentToCharacterChoiceFragment(ContinueType.RANDOM.typeNum)
            this.findNavController().navigate(action)
            //findNavController().navigate(R.id.action_FirstFragment_to_CharacterChoiceFragment)
        }
    }
}