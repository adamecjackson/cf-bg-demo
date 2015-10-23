@RestController
class WebApplication {

	@RequestMapping('/')
	String home(Map<String,Object> model) {		
		model['color'] = 'red'
		template 'index.html', model
	}
}
