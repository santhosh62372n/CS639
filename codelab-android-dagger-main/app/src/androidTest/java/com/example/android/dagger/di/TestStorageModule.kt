package com.example.android.dagger.di

import com.example.android.dagger.storage.Storage
import com.example.android.dagger.storage.FakeStorage
import dagger.Binds
import dagger.Module

@Module
abstract class TestStorageModule {

    // Makes Dagger provide FakeStorage when a Storage type is requested
    @Binds
    abstract fun provideStorage(storage: FakeStorage): Storage
}