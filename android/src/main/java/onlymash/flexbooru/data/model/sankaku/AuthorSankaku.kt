package onlymash.flexbooru.data.model.sankaku

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AuthorSankaku(
    @SerialName("avatar")
    val avatar: String? = null,
    @SerialName("id")
    val id: Int,
    @SerialName("name")
    val name: String
)