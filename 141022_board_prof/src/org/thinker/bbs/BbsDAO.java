/*
 * GenericDAO 상속받은 BbsDAO
 */

package org.thinker.bbs;

import org.thinker.common.GenericDAO;

public class BbsDAO extends GenericDAO<BbsVO, Integer> {

	public BbsDAO(){
		super("org.thinker.bbs.BbsMapper");
	}
}
