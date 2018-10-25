package com.example.myapplication.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.myapplication.R
import kotlinx.android.synthetic.main.auth_fragment.*

class AuthFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.auth_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        loginButton.setOnClickListener { view.findNavController().navigate(R.id.loginAction) }
        signupButton.setOnClickListener { view.findNavController().navigate(R.id.signupAction) }
    }
}