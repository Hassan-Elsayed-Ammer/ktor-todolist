package com.codelap

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    routing{
        get("/"){
            call.respondText { "Hello World From Ktor :)" }
        }

        //get All Todo Items
        get("/todos"){

        }


        //get specific item by id
        get("/todos/{id}"){

        }

        //create a new todo item
        post("/todos"){

        }

        //edited on specific Item by id
        put("/todos/{id}"){

        }

        //delete specific item by id
        delete("/todos/{id}"){

        }

    }

}

