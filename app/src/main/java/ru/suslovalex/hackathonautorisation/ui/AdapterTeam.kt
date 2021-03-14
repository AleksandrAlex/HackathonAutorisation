package ru.suslovalex.hackathonautorisation.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.suslovalex.hackathonautorisation.R
import ru.suslovalex.hackathonautorisation.data.Team


class AdapterTeam(private val adapterOnClick: (Team) -> Unit): ListAdapter<Team, TeamViewHolder>(TeamDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_team, parent, false)
        return TeamViewHolder(view)
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.bind(getItem(position))
        holder.itemView.setOnClickListener {
            adapterOnClick(getItem(position))
        }
    }
}


class TeamViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val teamName: TextView = itemView.findViewById(R.id.teamName)
    private val teamDescription: TextView = itemView.findViewById(R.id.descriptionTeam)

    fun bind(team: Team){
        teamName.text = team.name
        teamDescription.text = team.description
    }
}

class TeamDiffUtil : DiffUtil.ItemCallback<Team>() {
    override fun areItemsTheSame(oldItem: Team, newItem: Team): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Team, newItem: Team): Boolean {
        return oldItem == newItem
    }

}