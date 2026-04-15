package com.app.akademikapp.ui.main
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.app.akademikapp.MainActivity
import com.app.akademikapp.R
import com.app.akademikapp.databinding.FragmentMahasiswaBinding
class MahasiswaFragment : Fragment(R.layout.fragment_mahasiswa) {
    private var _binding: FragmentMahasiswaBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMahasiswaBinding.bind(view)
        binding.btnKembaliHomeMahasiswa.setOnClickListener {
            (activity as? MainActivity)?.supportFragmentManager?.popBackStack()
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}