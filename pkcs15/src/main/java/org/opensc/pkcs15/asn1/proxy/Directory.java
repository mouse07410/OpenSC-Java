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
 * Created: 29.12.2007
 * 
 ***********************************************************/

package org.opensc.pkcs15.asn1.proxy;

import org.bouncycastle.asn1.ASN1Encodable;

/**
 * A directory for resolving references, as e.g. implemented by
 * TokenInfo.
 * 
 * @author wglas
 */
public interface Directory<ReferenceType extends ASN1Encodable, EntityType extends ASN1Encodable> {

    /**
     * @param ref The reference to resolve.
     * @return The resolved entity or null, of the reference could not be resolved. 
     */
    EntityType resolveReference(ReferenceType ref);
    
    /**
     * @param ref The reference to store to.
     * @param entity A new entity to be registered.
     * @return A reference to the registered entity
     */
    void updateEntity(ReferenceType ref, EntityType entity);
    
}
