/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.openjpa.persistence.access.xml;

public class XMLEmbedMixedAccess {

    private transient String fName;
    private transient String lName;

    private String mName;

    public String getFirstName() {
        return fName;
    }

    public void setFirstName(String fname) {
        fName = fname;
    }

    public String getLastName() {
        return lName;
    }

    public void setLastName(String lname) {
        lName = lname;
    }

    public String getMiddleName() {
        return getMName();
    }

    public void setMiddleName(String mname) {
        setMName(mname);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof XMLEmbedMixedAccess) {
            XMLEmbedMixedAccess ps = (XMLEmbedMixedAccess)obj;
            return getFirstName().equals(ps.getFirstName()) &&
                getLastName().equals(ps.getLastName()) &&
                getMiddleName().equals(ps.getMiddleName());
        }
        return false;
    }

    public void setMName(String mName) {
        this.mName = mName;
    }

    public String getMName() {
        return mName;
    }
}
