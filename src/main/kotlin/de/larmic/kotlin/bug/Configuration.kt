package de.larmic.kotlin.bug

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated
import javax.validation.constraints.NotNull

@Component
@ConfigurationProperties("larmic")
@Validated
class Configuration {

    // TODO does not work with lateinit?
    @NotNull
    var hello: String? = null
}