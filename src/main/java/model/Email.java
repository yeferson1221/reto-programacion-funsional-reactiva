package model;

/**
 * model Email contiene los atributos de modelo tales como  email y estado,
 * mas dos constructores, uno con datos y el otro sin datos
 * @version [1,0.0]
 *
 * @author [Yeferson Valencia, alejandro.yandd@gmail.com   ]
 * @since [1,0,0]
 *
 */
public class Email {
private String email;
private boolean estado;

    /**
     * constructos con datos este si es usado
     * @author [Yeferson Valencia, alejandro.yandd@gmail.com   ]
     * @since [1,0,0]
     *
     */
    public Email(String email, boolean estado) {
        this.email = email;
        this.estado = estado;
    }

    /**
     * constructos sin datos no lo uso en el momento
     * @author [Yeferson Valencia, alejandro.yandd@gmail.com   ]
     * @since [1,0,0]
     *
     */
    public Email() {
    }

    /**
     * contiene solo los get que uso para acceder a los datos
     * @version [1,0.0]
     *
     * @author [Yeferson Valencia, alejandro.yandd@gmail.com   ]
     * @since [1,0,0]
     *
     */
    public String getEmail() {
        return email;
    }

    public boolean getEstado() {
        return estado;
    }

}
