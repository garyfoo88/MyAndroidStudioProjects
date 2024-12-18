package com.example.headlineshub.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.headlineshub.domain.usecase.app_entry.AppEntryUseCase
import com.example.headlineshub.ui.navgraph.Route
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val appEntryUseCase: AppEntryUseCase
) : ViewModel() {
    private val _splashCondition = mutableStateOf(true)
    val splashCondition: State<Boolean> = _splashCondition

    private val _startDestination = mutableStateOf(Route.AppStartNavigation.name)
    val startDestination: State<String> = _startDestination

    init {
        appEntryUseCase.readAppEntry().onEach { shouldStartFromHomeScreen ->
            if (shouldStartFromHomeScreen) {
                _startDestination.value = Route.NewsNavigation.name
            } else {
                _startDestination.value = Route.AppStartNavigation.name
            }
            delay(200)
            _splashCondition.value = false
        }.launchIn(viewModelScope)
    }
}