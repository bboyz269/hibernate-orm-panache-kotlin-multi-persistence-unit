package ac.me.entity.admin

import io.quarkus.hibernate.orm.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table
class Admin(
    var name: String = ""
) : PanacheEntity() {
    companion object : PanacheCompanion<Admin>
}