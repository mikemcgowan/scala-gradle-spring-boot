package hello

import java.time.{Clock, LocalDateTime}

import org.springframework.stereotype.Service

@Service
class TimeService {

  def localDateTime(): LocalDateTime = {
    LocalDateTime.now(Clock.systemUTC())
  }

}
