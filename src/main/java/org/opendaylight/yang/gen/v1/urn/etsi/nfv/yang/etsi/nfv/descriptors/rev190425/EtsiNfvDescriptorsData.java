package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * Network Function Virtualization Descriptors
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * module etsi-nfv-descriptors {
 *   yang-version 1.1;
 *   namespace urn:etsi:nfv:yang:etsi-nfv-descriptors;
 *   prefix nfv;
 *   include etsi-nfv-common;
 *   include etsi-nfv-ns;
 *   include etsi-nfv-vnf;
 *   include etsi-nfv-pnf;
 *   revision 2019-04-25 {
 *   }
 *   container nfv {
 *     list vnfd {
 *       key id;
 *       uses vnfd;
 *     }
 *     list nsd {
 *       key id;
 *       uses nsd;
 *     }
 *     list pnfd {
 *       key id;
 *       uses pnfd;
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface EtsiNfvDescriptorsData
    extends
    DataRoot
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nfv</code> <code>nfv</code>, or <code>null</code> if not present
     */
    @Nullable Nfv getNfv();

}

