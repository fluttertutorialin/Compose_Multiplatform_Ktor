package di

import org.koin.dsl.module
import viewmodel.HomeViewModel

val provideViewModelModule = module {
    single {
        HomeViewModel(get())
    }
}