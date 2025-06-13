# Spring Boot Post CRUD API

Este proyecto es una API REST sencilla para gestionar “posts” (entradas de blog).  
Permite crear, leer, actualizar y borrar registros de tipo `Post` (con campos **id**, **title**, **content** y **author**) usando Spring Boot y Spring Data JPA.

---

## ¿Qué hace?

1. **Listar todos los posts**  
   `GET /api/posts` → devuelve un array JSON con todas las entradas.

2. **Obtener un post por ID**  
   `GET /api/posts/{id}` → devuelve el post con ese ID (o 404 si no existe).

3. **Crear un post**  
   `POST /api/posts`
    - Cuerpo JSON: `{ "title": "...", "content": "...", "author": "..." }`
    - Devuelve el post creado con su `id`.

4. **Modificar un post**  
   `PUT /api/posts/{id}`
    - Cuerpo JSON igual al de creación.
    - Devuelve el post actualizado (o 404 si no existe).

5. **Borrar un post**  
   `DELETE /api/posts/{id}` → devuelve 204 No Content o 404 si no existe.

---

## ¿Cómo ejecutarla?

1. Clona el proyecto y entra en su carpeta:
   ```bash
   git clone https://github.com/alejandrobarreche/Feedback_4_Informatica_II_back

2. Entra en la carpeta del proyecto:
   ```bash
   cd Feedback_4_Informatica_II_back
   ```
3. Asegúrate de tener Java 21 y Maven instalados. Después, **compila** el proyecto y **ejecuta** la aplicación.

