package ru.netology
import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        val post = service.add(Post())

        val result = post.id
        assertEquals(1, result)

    }
    @Test
    fun updateTrue() {
        val service = WallService()
        service.add(Post())
        service.add(Post())
        service.add(Post())
        service.add(Post())

        val update = Post(4, 1, 1, 1, 1)
        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun updateFalse() {

        val service = WallService()
        service.add(Post())
        service.add(Post())
        service.add(Post())
        service.add(Post())

        val update = Post(6, 1, 1, 1, 1)
        val result = service.update(update)
        assertFalse(result)
    }
}



