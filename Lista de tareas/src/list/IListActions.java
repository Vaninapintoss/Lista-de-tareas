/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import list.exceptions.ElementAlreadyExistException;

/**
 *
 * @author vanim
 */
public interface IListActions <E>{
    boolean addElement(E e) throws ElementAlreadyExistException;
    String showElements();
    boolean checkElement(String name);
    boolean deleteElement(String name);
    boolean editNameElement(String name,String newName);
    E searchElement(String name);
}
