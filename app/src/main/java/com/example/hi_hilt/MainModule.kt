package com.example.hi_hilt

import android.content.Context
import android.widget.Toast
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * 作者：haoshuai on 2021/4/27 13:44
 * 邮箱：
 * desc：
 */
@Module
@InstallIn(ApplicationComponent::class)
abstract class MainModule {

    @Binds
    @Singleton
    abstract fun bindService(impl: LoginServiceImpl):ILoginService

//    @Provides
//    fun binService():ILoginService{
//        return LoginServiceImpl(context )
//    }
}

interface ILoginService{
    fun login()
}

class LoginServiceImpl @Inject constructor(@ApplicationContext val  context: Context):ILoginService{
    override fun login() {
        Toast.makeText(context,"LoginServiceImpl login",Toast.LENGTH_SHORT).show()
    }
}