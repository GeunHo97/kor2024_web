package day57;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

public class MVC {
}
// ---- MVC1 ------//
class Mvc1ViewController{  }
class Mvc1Dao{ }

// ---- MVC2 ------//
class Mvc2View{ }
class Mvc2Controller{ }
class Mvc2Dao{ }

// ---- MVC2 3티어 ----- //
// view : resource 안에 (html/css/js)존재
class Mvc2tire3Controller{ }
class Mvc2tire3Service{ }
class Mvc2tire3Dao{ }

// ---- Spring MVC2-3tire ---- //
@RestController
class MvcController{ }
@Service
class MvcService{ }
@Component
class MvcDao{ }











