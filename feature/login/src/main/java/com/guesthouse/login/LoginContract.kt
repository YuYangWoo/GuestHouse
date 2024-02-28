package com.guesthouse.login

import com.guesthouse.base.BaseContract

interface LoginContract : BaseContract<LoginContract.State, LoginContract.Event, LoginContract.Effect> {
    data class State(
        val isLoading: Boolean = false
    )

    sealed interface Event {
        data object OnKaKaoLoginClicked : Event
    }

    sealed interface Effect {

    }
}