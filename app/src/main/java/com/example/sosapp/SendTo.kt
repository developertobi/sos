package com.example.sosapp

import android.util.Log
import com.google.gson.GsonBuilder
import com.google.gson.JsonParser
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import retrofit2.Retrofit


class SendTo () {

//    fun sendToServer (){
//
//        val image : String
//    // Create Retrofit
//    val retrofit = Retrofit.Builder()
//        .baseUrl("https://dummy.restapiexample.com")
//        .build()
//
//    val service = retrofit.create(APIService::class.java)
//
//
//        val jsonObjectString= addDummyUser().toString()
//
//        // Create RequestBody ( We're not using any converter, like GsonConverter, MoshiConverter e.t.c, that's why we use RequestBody )
//        val requestBody = jsonObjectString.toRequestBody("application/json".toMediaTypeOrNull())
//
//        CoroutineScope(Dispatchers.IO).launch {
//            // Do the POST request and get response
//            val response = service.createEmployee(requestBody)
//
//            withContext(Dispatchers.Main) {
//                if (response.isSuccessful) {
//
//                    // Convert raw JSON to pretty JSON using GSON library
//                    val gson = GsonBuilder().setPrettyPrinting().create()
//                    val prettyJson = gson.toJson(
//                        JsonParser.parseString(
//                            response.body()
//                                ?.string()
//                        )
//                    )
//
//                    Log.d("Pretty Printed JSON :", prettyJson)
//
//                } else {
//
//                    Log.e("RETROFIT_ERROR", response.code().toString())
//
//                }
//            }
//        }
//        }
}