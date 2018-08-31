package hello

import java.time.format.DateTimeFormatter

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class HelloController {

  @Autowired
  var timeService: TimeService = _

  @RequestMapping(Array("/"))
  def index(): String =
    String format (
      "Greetings from Spring Boot @ %s",
      timeService.localDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
    )

}
