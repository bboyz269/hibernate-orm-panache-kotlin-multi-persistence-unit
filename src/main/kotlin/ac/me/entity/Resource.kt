package ac.me.entity

import ac.me.entity.admin.Admin
import ac.me.entity.cust.Cust
import javax.transaction.Transactional
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/api")
class Resource {

    @GET
    @Path("admin")
    @Transactional
    fun findAllAmin() = Admin.listAll()

    @GET
    @Path("cust")
    @Transactional
    fun findAllCust() = Cust.listAll()
}
