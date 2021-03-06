/**
 * TrialServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201603.cm;

public interface TrialServiceInterface extends java.rmi.Remote {

    /**
     * Loads a TrialPage containing a list of {@link Trial} objects
     * matching the selector.
     *         
     *         
     * @param selector defines which subset of all available trials to return,
     * the sort order, and
     *         which fields to include
     *         
     *         
     * @return Returns a page of matching trial objects.
     *         
     * @throws com.google.ads.api.services.common.error.ApiException if errors
     * occurred while
     *         retrieving the results.
     */
    public com.google.api.ads.adwords.axis.v201603.cm.TrialPage get(com.google.api.ads.adwords.axis.v201603.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201603.cm.ApiException;

    /**
     * Creates new trials, updates properties and controls the life
     * cycle of existing trials.
     *         See {@link TrialService} for details on the trial life cycle.
     * 
     *         
     * @return Returns the list of updated Trials, in the same order as the
     * {@code operations} list.
     *         
     * @throws com.google.ads.api.services.common.error.ApiException if errors
     * occurred while
     *         processing the request.
     */
    public com.google.api.ads.adwords.axis.v201603.cm.TrialReturnValue mutate(com.google.api.ads.adwords.axis.v201603.cm.TrialOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201603.cm.ApiException;

    /**
     * Loads a TrialPage containing a list of {@link Trial} objects
     * matching the query.
     *         
     *         
     * @param query defines which subset of all available trials to return,
     * the sort order, and
     *         which fields to include
     *         
     *         
     * @return Returns a page of matching trial objects.
     *         
     * @throws com.google.ads.api.services.common.error.ApiException if errors
     * occurred while
     *         retrieving the results.
     */
    public com.google.api.ads.adwords.axis.v201603.cm.TrialPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201603.cm.ApiException;
}
