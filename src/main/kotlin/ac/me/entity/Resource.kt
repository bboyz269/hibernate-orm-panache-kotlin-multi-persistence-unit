package ac.me.entity

import javax.transaction.Transactional
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/")
class Resource(
    private val kotlinKotlinRepository: ac.me.entity.kotlin.KotlinRepository
) {
    @GET
    @Path("kotlin")
    @Transactional
    fun kotlin() = kotlinKotlinRepository.listAll()
}
