package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * Network Services Descriptors
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-nsd</b>
 * <pre>
 * module etsi-nfv-nsd {
 *   yang-version 1.1;
 *   namespace urn:etsi:nfv:yang:etsi-nfv-nsd;
 *   prefix nsd;
 *   import etsi-nfv-descriptors {
 *     prefix vnf;
 *   }
 *   revision 2019-04-25 {
 *   }
 *   container nsd {
 *     list vnfd {
 *       key id;
 *       uses vnf:vnfd;
 *     }
 *     list nsd {
 *       key id;
 *       max-elements 1;
 *       uses vnf:nsd;
 *     }
 *     list pnfd {
 *       key id;
 *       uses vnf:pnfd;
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface EtsiNfvNsdData
    extends
    DataRoot
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.Nsd</code> <code>nsd</code>, or <code>null</code> if not present
     */
    @Nullable Nsd getNsd();

}

