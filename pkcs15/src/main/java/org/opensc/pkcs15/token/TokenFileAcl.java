/***********************************************************
 * $Id$
 * 
 * PKCS#15 cryptographic provider of the opensc project.
 * http://www.opensc-project.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Created: 25.12.2007
 * 
 ***********************************************************/

package org.opensc.pkcs15.token;

/**
 * This interface describes the access control list common to all token
 * files. 
 * 
 * @author wglas
 */
public interface TokenFileAcl {

    public static final int AC_ALWAYS = 0;

    public static final int AC_NEVER = 0xff;

    /**
     * @return the acUpdate
     */
    public int getAcUpdate();

    /**
     * @return the acAppend
     */
    public int getAcAppend();

    /**
     * @return the acActivate
     */
    public int getAcActivate();

    /**
     * @return the acDeactivate
     */
    public int getAcDeactivate();

    /**
     * @return the acDelete
     */
    public int getAcDelete();

    /**
     * @return the acAdmin
     */
    public int getAcAdmin();

}