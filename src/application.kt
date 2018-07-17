import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import java.time.LocalDateTime.*

fun main(args: Array<String>) {
    val server = embeddedServer(Netty, port = 8080) {
        routing {
            get("/") {
                call.respondText("Hello World! The time is now ${now()}.", ContentType.Text.Plain)
            }
            get("/demo") {
                call.respondText("HELLO WORLD, The time is now ${now()}.")
            }
        }
    }
    server.start(wait = true)
}

