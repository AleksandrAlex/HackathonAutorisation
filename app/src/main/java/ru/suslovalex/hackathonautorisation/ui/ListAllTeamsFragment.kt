package ru.suslovalex.hackathonautorisation.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import ru.suslovalex.hackathonautorisation.R
import ru.suslovalex.hackathonautorisation.data.Team


class ListAllTeamsFragment : Fragment(R.layout.fragment_list_all_teams) {

    private lateinit var teamAdapter : AdapterTeam

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupToolbar(view)

        setupUi(view)
        setupFab(view)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        activity?.menuInflater?.inflate(R.menu.menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.profile){
            findNavController().navigate(R.id.action_listAllTeamsFragment_to_profileFragment)
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    private fun setupToolbar(view: View) {

        val toolbar: Toolbar = view.findViewById(R.id.toolbar)
        activity?.setActionBar(toolbar)

    }

    private fun setupFab(view: View) {
        val fab: FloatingActionButton = view.findViewById(R.id.fab)
        fab.setOnClickListener {
            it.findNavController().navigate(R.id.action_listAllTeamsFragment_to_createCommandFragment)
        }
    }

    private fun setupUi(view: View) {

        teamAdapter = AdapterTeam{team -> onClick(team) }
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

    private fun onClick(team: Team) {
        val action =
            ListAllTeamsFragmentDirections.actionListAllTeamsFragmentToTeamDescriptionFragment(team)
        view?.findNavController()?.navigate(action)


    }


}