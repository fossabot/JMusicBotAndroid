package com.ivoberger.jmusicbot.model

import com.squareup.moshi.Types
import java.lang.reflect.Type

sealed class MoshiTypes {
    companion object {
        val SongList: Type = Types.newParameterizedType(List::class.java, Song::class.java)
    }
}
