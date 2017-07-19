package org.fossasia.susi.ai.rest.responses.susi

import com.squareup.moshi.Json
import io.realm.RealmList

/**
 * <h1>Pparse retrofit response from susi client.</h1>
 */
class SusiResponse (
    val clientId: String,
    val query: String,
    val queryDate: String,
    val answerDate: String,
    val answerTime: Int,
    val count: Int,
    val answers: List<Answer>,
    val session: Session
)

class SignUpResponse (
    val message: String,
    val session: Session
)

class MemoryResponse (
    var cognitions: List<SusiResponse>?,
    var session: Session
)

class LoginResponse (
    val message: String,
    val session: Session,
    val validSeconds: Long,
    var accessToken: String?
)

class Session (
    val identity: Identity
)

class Identity (
    val name: String?,
    val type: String?,
    val anonymous: Boolean
)

class ForgotPasswordResponse (
    val message: String?
)

class Answer (
    val data: RealmList<Datum>,
    val metadata: Metadata,
    val actions: List<Action>
)

class Metadata (
    val count: Int
)

class Action (
    val delay: Long,
    val expression: String?,
    val type: String?,
    @Json(name = "link")
    val anchorLink: String?,
    @Json(name = "text")
    val anchorText: String?,
    val query: String?,
    val latitude: Double,
    val longitude: Double,
    val zoom: Double,
    val count: Int
)