package ru.suslovalex.hackathonautorisation

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class TeamDescriptionFragment : Fragment() {

    private val args by navArgs<TeamDescriptionFragmentArgs>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = LayoutInflater.from(context).inflate(R.layout.fragment_team_description, container, false)

        val name: TextView = view.findViewById(R.id.team_name)
        name.text = args.team.name

        val description:TextView =  view.findViewById(R.id.description)
        description.text = args.team.description

        val btnBack: Button = view.findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_teamDescriptionFragment_to_listAllTeamsFragment)
        }

        return view

    }


}