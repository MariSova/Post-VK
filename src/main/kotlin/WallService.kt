package ru.netology

class WallService {
    private var posts = emptyArray<Post>()
    private var lastIndex =0

    fun add(post: Post): Post {
        posts += post.copy(id = lastIndex ++)

        return posts.last()
    }

    fun update(post: Post): Boolean {
        TODO()
    }

}