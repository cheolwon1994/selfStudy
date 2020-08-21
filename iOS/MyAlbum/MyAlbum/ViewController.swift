//
//  ViewController.swift
//  MyAlbum
//
//  Created by ccw on 2020/08/11.
//  Copyright © 2020 cheolwon choi. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    var curVal = 0
    
    @IBOutlet weak var priceLabel: UILabel!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        refresh()
    }

    @IBAction func hello(_ sender: Any) {
        
        let message = "현재 물품의 가격은 \(curVal) 입니다"
        
        let alert=UIAlertController(title: "Hello", message: message, preferredStyle: .alert)
        
        let action = UIAlertAction(title: "OK", style: .default, handler: {action in self.refresh()})
        alert.addAction(action)
        present(alert,animated: true,completion: nil)
    }
    
    func refresh(){
        let randomPrice = arc4random_uniform(10000)+1
        curVal = Int(randomPrice)
        priceLabel.text = "\(curVal)₩"
        print("hi")
    }
}

