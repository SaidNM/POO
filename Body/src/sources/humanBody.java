/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

/**
 *
 * @author alumno
 */
public class humanBody
{
    private heart corazon;
    private helmet casco;
    
    public humanBody(heart corazon,helmet casco)
    {
        this.corazon = corazon;
        this.casco = casco;
    }

    public heart getCorazon() {
        return corazon;
    }

    public void setCorazon(heart corazon) {
        this.corazon = corazon;
    }

    public helmet getCasco() {
        return casco;
    }

    public void setCasco(helmet casco) {
        this.casco = casco;
    }

    @Override
    public String toString() {
        return "humanBody{" + "corazon=" + corazon + ", casco=" + casco + '}';
    }
    
    
    
}
