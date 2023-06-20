/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list;

import list.exceptions.ElementAlreadyExistException;
import list.exceptions.NameTaskNotFoundException;
import list.exceptions.TaskUntilNotCompletedException;
import list.task.exceptions.EmptyNameTaskException;

/**
 *
 * @author vanim
 */
public interface IListActions <E>{
    boolean addElement(E e) throws ElementAlreadyExistException;
    String showElements();
    boolean checkElement(String name) throws EmptyNameTaskException, NameTaskNotFoundException;
    boolean deleteElement(String name) throws EmptyNameTaskException, NameTaskNotFoundException, TaskUntilNotCompletedException;
    boolean editNameElement(String name,String newName) throws EmptyNameTaskException, NameTaskNotFoundException;
    E searchElement(String name);
}
