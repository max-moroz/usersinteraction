# UsersInteraction

## How it works

* Application allows creating, updating and fetching users. 
* User shall be authorized to fetch and update other users. However, creation doesn't require authorization.
* Postman collection is located in `resources` directory
* Users to input in JSON format are also in `resources` directory in file `initial_input.json`
* All passwords are encoded in `Bcrypt`
* Password for `John` is `security`, password for `Max123` - `123`
* MongoDB Docker image ver 4.4 was used during Application creation.