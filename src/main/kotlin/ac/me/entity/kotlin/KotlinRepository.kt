package ac.me.entity.kotlin

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class KotlinRepository : PanacheRepository<Kotlin>