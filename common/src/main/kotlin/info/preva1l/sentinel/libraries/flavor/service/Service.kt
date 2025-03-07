package info.preva1l.sentinel.libraries.flavor.service

import java.lang.annotation.Inherited

/**
 * Marks a class as a flavor Service.
 *
 * If the [name] is blank, an identifier
 * will be automatically created.
 *
 * Services are sorted by their priority
 * when initialized.
 *
 * @author GrowlyX
 * @since 1/2/2022
 */
@Inherited
@MustBeDocumented
@Target(AnnotationTarget.CLASS)
annotation class Service(
    val name: String = "",
    val priority: Int = 1
)
