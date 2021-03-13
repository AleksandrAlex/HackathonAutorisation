package ru.suslovalex.hackathonautorisation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import ru.suslovalex.hackathonautorisation.data.Team
import ru.suslovalex.hackathonautorisation.ui.AdapterTeam


class ListAllTeamsFragment : Fragment(R.layout.fragment_list_all_teams) {

    private val teamAdapter = AdapterTeam()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupUi(view)
        setupFab(view)
    }

    private fun setupFab(view: View) {
        val fab: FloatingActionButton = view.findViewById(R.id.fab)
        fab.setOnClickListener {
            it.findNavController().navigate(R.id.action_listAllTeamsFragment_to_createCommandFragment)
        }
    }

    private fun setupUi(view: View) {
        val teamsList: RecyclerView = view.findViewById(R.id.teams_list)
        teamsList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = teamAdapter
        }
        val list = mutableListOf<Team>()
        for (i in 0..20){
            list.add(Team(name = "team $i", description = "description $i"))
        }
        teamAdapter.submitList(list)

    }


}