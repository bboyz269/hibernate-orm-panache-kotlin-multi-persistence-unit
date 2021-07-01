package ac.me.entity.cust

import io.quarkus.hibernate.orm.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table
class Cust(
    var name: String = ""
) : PanacheEntity() {
    companion object : PanacheCompanion<Cust>
}
