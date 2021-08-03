package ac.me.entity.java

import io.quarkus.hibernate.orm.panache.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class JavaRepository : PanacheRepository<Java>