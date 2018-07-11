/**
 * This source code is property of MyContacts Project Team.
 */
package com.contacts.contact_management.dao;

import java.util.List;

import com.contacts.contact_management.model.Occasion;



public interface OccasionDAOCustom {

	List<Occasion> getAllOccasionsByCurrentDate();

}
