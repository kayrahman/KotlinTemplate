package com.nkr.kotlintemplate

import android.app.Application
import androidx.viewbinding.BuildConfig
import com.google.android.gms.common.util.CollectionUtils.listOf
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }

        /**
         * use Koin Library as a service locator
         */
        val myModule = module {
            //Declare a ViewModel - be later inject into Fragment with dedicated injector using by viewModel()
//

//            viewModel {
//                HomeViewModel(
//                    get() as IRepoDataSource,
//                    get(),
//                    this@App
//                )
//
//            }
//
//            viewModel {
//                AuthenticationViewModel(
//                    this@App,
//                   get() as IRepoDataSource
//                )
//            }
//
//
//            viewModel {
//                UploadMemeViewModel(
//                    this@App,
//                    get() as IRepoDataSource
//                )
//            }
//
//            viewModel {
//                ProductDetailViewModel(
//                    this@App,
//                    get() as IRepoDataSource
//                )
//            }
//
//            viewModel {
//                AccountViewModel(
//                    this@App,
//                    get() as IRepoDataSource
//                )
//            }
//
//            single { BicchuRepository(get() as ILocalDataSource,get() as IRemoteDataSource) as IRepoDataSource }
//            single { RemoteSourceImpl() as IRemoteDataSource }
//            single { BicchuLocalRepositoryImpl(get()) as ILocalDataSource }
//            single { BicchuLocalDatabase.getInstance(this@App).dao }

        }

        startKoin {
            androidContext(this@App)
            modules(listOf(myModule))
        }



    }



}