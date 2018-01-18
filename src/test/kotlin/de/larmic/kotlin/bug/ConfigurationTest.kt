package de.larmic.kotlin.bug

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class ConfigurationTest {

    @Autowired
    lateinit var configuration: Configuration

    @Test
    fun `check configuration initializing on default stage`() {
        assertThat(configuration.hello).isEqualTo("helloworld!")
    }

}