package tech.hipporasy.ktoroutine

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}