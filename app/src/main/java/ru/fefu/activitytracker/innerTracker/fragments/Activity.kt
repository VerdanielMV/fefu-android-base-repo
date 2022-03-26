package ru.fefu.activitytracker.innerTracker.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import ru.fefu.activitytracker.databinding.FragmentActivityBinding
import ru.fefu.activitytracker.innerTracker.adapter.ActivityFragmentAdapter


class Activity : Fragment() {
    private var _binding: FragmentActivityBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentActivityBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.pagerActivity.adapter = ActivityFragmentAdapter(this)
        TabLayoutMediator(binding.tabsActivity, binding.pagerActivity) {tab, position ->
            if (position == 0) tab.text = "Мои"
            else tab.text = "Пользователей"
        }.attach()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): Activity {return Activity()}
    }
}