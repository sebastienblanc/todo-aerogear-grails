class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
        "/projects/$id?"(resource: "project")
        "/tags/$id?"(resource: "tag")
        "/tasks/$id?"(resource: "task")

		"/"(view:"/index.html")
		"500"(view:'/error')
	}
}
