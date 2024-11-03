package com.example.headlineshub.ui.components.onboarding

sealed class OnboardingEvent {
    data object SaveAppEntry : OnboardingEvent()
}