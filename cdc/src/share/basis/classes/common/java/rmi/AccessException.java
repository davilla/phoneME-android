/*
 * @(#)AccessException.java	1.8 06/10/10
 *
 * Copyright  1990-2008 Sun Microsystems, Inc. All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License version
 * 2 only, as published by the Free Software Foundation. 
 * 
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License version 2 for more details (a copy is
 * included at /legal/license.txt). 
 * 
 * You should have received a copy of the GNU General Public License
 * version 2 along with this work; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA 
 * 
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa
 * Clara, CA 95054 or visit www.sun.com if you need additional
 * information or have any questions. 
 *
 */

package java.rmi;

/**
 * An <code>AccessException</code> is thrown by certain methods of the
 * <code>java.rmi.Naming</code> class (specifically <code>bind</code>,
 * <code>rebind</code>, and <code>unbind</code>) and methods of the
 * <code>java.rmi.activation.ActivationSystem</code> interface to
 * indicate that the caller does not have permission to perform the action
 * requested by the method call.  If the method was invoked from a non-local
 * host, then an <code>AccessException</code> is thrown.
 * 
 * @version 1.9, 02/02/00
 * @author  Ann Wollrath
 * @author  Roger Riggs
 * @since   JDK1.1
 * @see     java.rmi.Naming
 * @see     java.rmi.activation.ActivationSystem
 */
public class AccessException extends java.rmi.RemoteException {
    /* indicate compatibility with JDK 1.1.x version of class */
    private static final long serialVersionUID = 6314925228044966088L;
    /**
     * Constructs an <code>AccessException</code> with the specified
     * detail message.
     *
     * @param s the detail message
     * @since JDK1.1
     */
    public AccessException(String s) {
        super(s);
    }

    /**
     * Constructs an <code>AccessException</code> with the specified
     * detail message and nested exception.
     *
     * @param s the detail message
     * @param ex the nested exception
     * @since JDK1.1
     */
    public AccessException(String s, Exception ex) {
        super(s, ex);
    }
}
